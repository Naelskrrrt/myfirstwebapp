package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    // "say-hello" => "Hello! What are you learning today?"

    //    localhost:8080/say-hello
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    //    src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("/say-hello-jsp")
    public String sayHelloJSP() {
        return "sayHello"; // This will look for sayHello.jsp in the jsp folder
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        return """
                <html>
                    <head>
                        <title>Hello Page</title>
                    </head>
                    <body>
                        <h1>Hello! What are you learning today? in HTML</h1>
                    </body>
                </html>
                """; // This is a text block
    }
}
