package com.example.SampleDemo.Controller;

import com.example.SampleDemo.Services.FetchDataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleServiceController {

  @RequestMapping("/ListFacilitiesonMP")
  public String ListFacilitiesonMP()
  {
    FetchDataService FetchDataService = new FetchDataService();
    return FetchDataService.showDetails();
  }
}
