package org.dcb.spring101.service.impl;

import org.dcb.spring101.service.BestService;

public class SecondBestService implements BestService {

    @Override
    public String theBestMethod() {
        return "The Second Service is the best";
    }
}
