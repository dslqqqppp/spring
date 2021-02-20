package auto.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import auto.demo.service.AppService;

@Controller
public class AppController {

	@Autowired
	private AppService service;
}
