package controller;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {
	@Autowired
    private MemberService memberService;

}
