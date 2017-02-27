package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		assertEquals(0, Add.addAny(0, 0));
		//
		// write other test cases here:
		//
		for(int i=0;i<10;i++){
			assertEquals(i,Add.addAny(0,i));
			assertEquals(i,Add.addAny(i,0));
			
		}
	}
	@Test
    public void test2(){
    	for(int i=0;i<100;i++){
    		for(int j=100;j<200;j++){
    			assertEquals(i+j,Add.addAny(i, j));
    		}
    	}
    }
	@Test
	public void special(){
		assertEquals(-2,Add.addAny(-4,2));
		assertEquals(-2,Add.addAny(2,-4));
		
	}
}
