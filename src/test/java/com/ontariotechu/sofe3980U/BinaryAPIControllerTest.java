package com.ontariotechu.sofe3980U;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(BinaryAPIController.class)
public class BinaryAPIControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdditionAPI() throws Exception {
        mockMvc.perform(get("/add?operand1=101&operand2=11"))
                .andExpect(status().isOk())
                .andExpect(content().string("1000"));
    }

    @Test
    public void testMultiplicationAPI() throws Exception {
        mockMvc.perform(get("/multiply?operand1=10&operand2=11"))
                .andExpect(status().isOk())
                .andExpect(content().string("110"));
    }

    @Test
    public void testAndOperationAPI() throws Exception {
        mockMvc.perform(get("/and?operand1=101&operand2=011"))
                .andExpect(status().isOk())
                .andExpect(content().string("001"));
    }
}
