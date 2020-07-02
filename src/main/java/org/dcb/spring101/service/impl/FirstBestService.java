package org.dcb.spring101.service.impl;

import org.dcb.spring101.service.BestService;

public class FirstBestService implements BestService {

    @Override
    public String theBestMethod() {
        return "The first Service is the best";
    }
}
