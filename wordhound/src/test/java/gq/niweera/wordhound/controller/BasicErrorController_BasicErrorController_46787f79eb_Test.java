package gq.niweera.wordhound.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.servlet.RequestDispatcher;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class BasicErrorControllerTest {

    private MockMvc mockMvc;
    private ErrorController basicErrorController;

    @Before
    public void setup() {
        this.basicErrorController = new BasicErrorController();
        this.mockMvc = MockMvcBuilders.standaloneSetup(basicErrorController).build();
    }

    @Test
    public void testBasicErrorController() throws Exception {
        assertNotNull(basicErrorController);
    }

    @Test
    public void testErrorPageNotFound() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();

        request.setAttribute(RequestDispatcher.ERROR_STATUS_CODE, HttpStatus.NOT_FOUND.value());

        mockMvc.perform(get("/error"))
                .andExpect(status().is(HttpStatus.NOT_FOUND.value()));
    }
}
