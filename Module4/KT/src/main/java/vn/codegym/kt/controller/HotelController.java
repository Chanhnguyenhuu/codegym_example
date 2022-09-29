package vn.codegym.kt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.kt.service.IHotelService;

@Controller
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private IHotelService hotelService;
}
