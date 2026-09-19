package UniTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import HinhHoc.Circle;
import HinhHoc.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
public class ShapeTest {
	private static int nbTC = 0;
	private static Triangle t;
	private static Circle c;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before All");
		t = new Triangle("Triangle");
		c = new Circle("Circle");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("Before TC:"+ ++nbTC);
	}
	
	@Test
	void test() {
		t.setBase(10);
		t.setHeight(5);
		c.setRadius(5);
		System.out.println("The area of " + t.getName() + ":" + t.getArea());
		System.out.println("The area of " + c.getName() + ":" + c.getArea());
		
		assertEquals((double)25.0, t.getArea());
		assertEquals((float)78.5398178100586, c.getArea());
	}
	
	@RepeatedTest(2)
		void repeatedTest() {
		t.setBase(2);
		t.setHeight(1);
		c.setRadius(5);
		System.out.println("The area of " + t.getName() + " : " + t.getArea());
		System.out.println("The area of " + c.getName() + " : " + c.getArea());
		assertEquals((float)1.0, t.getArea());
		assertEquals((float)78.5398178100586, c.getArea());

	}
	
	@ParameterizedTest
	@CsvSource({"2,10,10",
			"100,2,100"})
	void testWithCSVSource(float base,float height,float area) {
		t.setBase(base);
		t.setHeight(height);
		System.out.println(t.getArea());
		assertEquals(area, t.getArea());
	}
	
	@ParameterizedTest
	@CsvFileSource(files = "D:\\TEST\\BaiTap1\\src\\UniTest\\Vidu_testcases.csv", numLinesToSkip = 1)
	void testWithCSVFile(float base, float height, float area) {
		t.setBase(base);
		t.setHeight(height);
		System.out.println(t.getArea());
		assertEquals(area, t.getArea());
	}
	
	@ParameterizedTest
	@MethodSource("baseHeightAreaProvider")
	void testWithMethodSource(float base, float height, float area) {
		t.setBase(base);
		t.setHeight(height);
		System.out.println(t.getArea());
		assertEquals(area, t.getArea());
	}

	static Stream<Arguments> baseHeightAreaProvider(){
		return Stream.of(
				Arguments.arguments(10000, 2, 10000),
				Arguments.arguments(9999999, 2, 9999999)
				);
	}
	
	@AfterAll
	public static void  afterClass() {
		System.out.println("Total of TCs: " + nbTC);
		System.out.println("After All");
	}
	
	//execute for each test, after executing test

	@AfterEach
	public void after() {
		System.out.println("After TCCCC: " + nbTC);
	}


}
