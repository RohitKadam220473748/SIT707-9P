package web.service;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;

public class TestMathQuestionService {

	 @Test
	    public void testSuccessinAdding() {
	        Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);
	    }

	    @Test
	    public void testAddNumber1isNullandNumber2is3() {
	        Assert.assertTrue(Double.isNaN(MathQuestionService.q1Addition(null, "3")));
	    }

	    @Test
	    public void testAddNumber2NullandNumber1is3() {
	        Assert.assertTrue(Double.isNaN(MathQuestionService.q1Addition("3", null)));
	    }

	    @Test
	    public void testAddBothNumber1andNumber2isNull() {
	        Assert.assertTrue(Double.isNaN(MathQuestionService.q1Addition(null, null)));
	    }

	    @Test
	    public void testSuccessinSubtraction() {
	        Assert.assertEquals(MathQuestionService.q2Subtraction("3", "2"), 1, 0);
	    }


	    @Test
	    public void testSubtractionNumber1isNullandNumber2is3() {
	        Assert.assertTrue(Double.isNaN(MathQuestionService.q2Subtraction(null, "3")));
	    }

	    @Test
	    public void testSubtractionNumber2isNullandNumber1is3() {
	        Assert.assertTrue(Double.isNaN(MathQuestionService.q2Subtraction("3", null)));
	    }

	    @Test
	    public void testSubtractionBothNumber1andNumber2isNull() {
	        Assert.assertTrue(Double.isNaN(MathQuestionService.q2Subtraction(null, null)));
	    }

	    @Test
	    public void testSuccessinMultiplication() {
	        Assert.assertEquals(MathQuestionService.q3Multiplication("2", "3"), 6, 0);
	    }

	    @Test
	    public void testMultiplicationNumber1isNullandNumber2is3() {
	        Assert.assertTrue(Double.isNaN(MathQuestionService.q3Multiplication(null, "3")));
	    }

	    @Test
	    public void testMultiplicationNumber2isNullandNumber1is3() {
	        Assert.assertTrue(Double.isNaN(MathQuestionService.q3Multiplication("3", null)));
	    }

	    @Test
	    public void testMultiplicationBothNumber1andNumber2isNull() {
	        Assert.assertTrue(Double.isNaN(MathQuestionService.q3Multiplication(null, null)));
	    }	
}
