package com.example.SampleDemo.Services;

import com.example.SampleDemo.DAO.FacilityListDAO;

public class FetchDataService {
  public String showDetails()
  {
    FacilityListDAO FacilityListDAO = new FacilityListDAO();
    FacilityListDAO.setA("Personal Loan");
    FacilityListDAO.setB("5");
    return FacilityListDAO.getA();
  }
}
