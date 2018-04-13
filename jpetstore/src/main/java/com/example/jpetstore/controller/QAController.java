package com.example.jpetstore.controller;

@Controller
@RequestMapping("qwriteform.do", "qsendform.do")
public class QAController{


	//문의게시판 버튼을 클릭하면 문의 리스트를 반환한다
	@RequestMapping("/qalistd.do")
	List<QAlist> getQAList(){
	}

	//문의글 작성 - GET:form작성페이지 POST:작성결과
	@RequestMapping(method=RequestMethod.GET)
	public String showQAForm(){
	}
	@RequestMapping(method=RequestMethod.POST)
	public String addQAList(HttpServeletRequest request, HttpSession session,
			@ModelAttribute("QAForm") QAForm qaform, BindingRequest result){
	}

	//판매자문의 - sellerId와 일치하는 Qalist를 반환한다.
	@RequestMapping("qsellerlist.do")
	publuic List<QAlist> getSellerList(@RequestParam("sellerId") String sellerID){
	}


	//답변달기
	@RequestMapping("writeform.do")
	public String writeComment(@RequestParam("qNumber") String qNumber){
	}
