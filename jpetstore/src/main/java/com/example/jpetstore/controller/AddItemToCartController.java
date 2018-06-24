package com.example.jpetstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.example.jpetstore.domain.Cart;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.service.PetStoreFacade;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified-by Changsup Park
 */
@Controller
@SessionAttributes("sessionCart")
public class AddItemToCartController { 

	private PetStoreFacade petStore;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	@ModelAttribute("sessionCart")
	public Cart createCart() {
		return new Cart();
	}
	
	@RequestMapping("/shop/addItemToCart.do")
	public ModelAndView handleRequest(
			HttpServletRequest request,
			@RequestParam("item") String workingItemId,
			@ModelAttribute("sessionCart") Cart cart 
			) throws Exception {
		if (cart.containsItemId(workingItemId)) {
			cart.incrementQuantityByItemId(workingItemId);
		}
		else {
			// isInStock is a "real-time" property that must be updated
			// every time an item is added to the cart, even if other
			// item details are cached.
			int quantity = Integer.parseInt(request.getParameter("quantity"));
			boolean isInStock = this.petStore.isItemInStock(workingItemId);
			Item item = this.petStore.getItem(workingItemId);
			System.out.println(item.getItemId() + isInStock);
			cart.addItem(item, isInStock, quantity);
		}
		return new ModelAndView("tiles/Cart", "cart", cart);
	}
}