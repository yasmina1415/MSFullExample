//package com.example.userservice.controllers;
//
//
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class FallBackController {
//
//
//    @GetMapping("/userServiceFallBack")
//
//    public String userServiceFallBack(){
//        return "this service took more than expected";
//    }
//
////    @GetMapping("/departmentServiceFallBack")
////    public String departmentServiceFallBack(){
////        return "this service took more than expected";
////    }
//}
//
