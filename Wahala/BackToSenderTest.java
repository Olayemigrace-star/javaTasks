import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{

	@Test
	public void testThatSuccessfulDeliveryIsLessThan50Percent(){
		//Given
		int successfulDelivery = 25;
		
		//When
		int expectedPayment = BackToSender.riderPayment(successfulDelivery);

		//check
		int actualPayment = 9000;
		assertEquals(actualPayment, expectedPayment);
	}
	
	@Test
	public void testThatSuccessfulDeliveryIsGreaterOrEqualTo50AndLessThan60Percent(){
		//Given
		int successfulDelivery = 55;
		
		//When
		int expectedPayment = BackToSender.riderPayment(successfulDelivery);

		//check
		int actualPayment = 16000;
		assertEquals(actualPayment, expectedPayment);
	}

    @Test
	public void testThatSuccessfulDeliveryIsGreaterOrEqualT060AndLessThan70Percent(){
		//Given
		int successfulDelivery = 67;
		
		//When
		int expectedPayment = BackToSender.riderPayment(successfulDelivery);

		//check
		int actualPayment = 21750;
		assertEquals(actualPayment, expectedPayment);
	 }
	@Test
	public void testThatSuccessfulDeliveryIsEqualTo70AndGreaterThan70Percent(){
		//Given
		int successfulDelivery = 80;
		
		//When
		int expectedPayment = BackToSender.riderPayment(successfulDelivery);

		//check
		int actualPayment = 9000;
		assertEquals(actualPayment, expectedPayment);
	 }
	
	
	}
