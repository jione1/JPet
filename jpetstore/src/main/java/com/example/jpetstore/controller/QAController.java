package com.example.jpetstore.controller;

@Controller
@RequestMapping("qwriteform.do", "qsendform.do")
public class QAController{


	//���ǰԽ��� ��ư�� Ŭ���ϸ� ���� ����Ʈ�� ��ȯ�Ѵ�
	@RequestMapping("/qalistd.do")
	List<QAlist> getQAList(){
	}

	//���Ǳ� �ۼ� - GET:form�ۼ������� POST:�ۼ����
	@RequestMapping(method=RequestMethod.GET)
	public String showQAForm(){
	}
	@RequestMapping(method=RequestMethod.POST)
	public String addQAList(HttpServeletRequest request, HttpSession session,
			@ModelAttribute("QAForm") QAForm qaform, BindingRequest result){
	}

	//�Ǹ��ڹ��� - sellerId�� ��ġ�ϴ� Qalist�� ��ȯ�Ѵ�.
	@RequestMapping("qsellerlist.do")
	publuic List<QAlist> getSellerList(@RequestParam("sellerId") String sellerID){
	}


	//�亯�ޱ�
	@RequestMapping("writeform.do")
	public String writeComment(@RequestParam("qNumber") String qNumber){
	}
