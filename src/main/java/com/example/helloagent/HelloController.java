package com.example.helloagent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller that exposes a single endpoint returning a greeting.
 *
 * <p>When a client performs a GET request on the root path (<code>/</code>),
 * the {@link #hello()} method will run and return a plain-text greeting.  This
 * demonstrates the minimal code required to create a RESTful endpoint with
 * Spring\u00a0Boot.</p>
 */
@RestController
public class HelloController {

    /**
     * Respond with a simple greeting.
     *
     * @return the string "hello"
     */
    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}
