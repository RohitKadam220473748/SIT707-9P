package web.service;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;

public class TestMathQuestionService {

	@Test
	public void testTrueAdd() {
		Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);
	}

	@Test
	public void testAddNumber1Empty() {
        Assert.assertTrue(Double.isNaN(MathQuestionService.q1Addition(null, "3")));
	}	
}
