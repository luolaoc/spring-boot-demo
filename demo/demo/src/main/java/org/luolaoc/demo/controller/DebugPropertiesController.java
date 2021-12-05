package org.luolaoc.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.luolaoc.demo.property.ApplicationProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DebugPropertiesController {
    private final ApplicationProperty applicationProperty;

    @Autowired
    public DebugPropertiesController(ApplicationProperty applicationProperty) {
        this.applicationProperty = applicationProperty;
    }

    @GetMapping("/applicationProperty")
    public Map<String, String> getApplicationProperty() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("application_property", applicationProperty.toString());
        return map;
    }
}