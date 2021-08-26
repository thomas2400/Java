package Maths;

public class Volume {
	public static void main(String[] args) {
		
	    /* test cube */
	    assert Double.compare(volumeCube(1), 1.0) == 0;
	    
	    /* test sphere */
	    assert Double.compare(volumeSphere(1), 4.188790) == 0;

	    /* test cuboid */
	    assert Double.compare(volumeCuboid(10, 20, 10), 2000.0) == 0;

	    /* test triangular prism */
	    assert Double.compare(volumeTriangularPrism(5, 5, 5), 62.5) == 0;
 
	    /* test pentagonal prism */
	    assert Double.compare(volumePentagonalPrism(10, 5, 5), 125.0) == 0;

	    /* test hemisphere */
	    assert Double.compare(volumeHemisphere(10), 2094.395102) == 0;

	    /* test cone */
	    assert Double.compare(volumeCone(10, 20), 2094.395102) == 0;

	    /* test pyramid */
	    assert Double.compare(volumePyramid(20, 10, 10), 666.666667) == 0;
		
	    /* test cylinder */
	    assert Double.compare(volumeCylinder(10, 20), 6283.185307) == 0;
	  }
	
	  /**
	   * Calculate the volume of a cube.
	   *
	   * @param sideLength side length of cube
	   * @return volume of given cube
	   */
	  private static double volumeCube(double sideLength) {
	    return sideLength * sideLength * sideLength;
	  }

	  /**
	   * Calculate the volume of a sphere.
	   *
	   * @param radius radius of sphere
	   * @return volume of given sphere
	   */
	  private static double volumeSphere(double radius) {
	    return 4.0 / 3.0 * Math.PI * radius * radius * radius;
	  }

	  /**
	   * Calculate the volume of a cuboid
	   *
	   * @param height height of cuboid
	   * @param length length of cuboid
	   * @param width width of cuboid
	   * @return volume of given cuboid
	   */
	  private static double volumeCuboid(double height, double length, double width) {
	    return height * length * width;
	  }

	  /**
	   * Calculate the volume of a triangular prism
	   *
	   * @param base base of triangular prism
	   * @param height height of triangular prism
	   * @return volume of given triangular prism
	   */
	  private static double volumeTriangularPrism(double base, double triangleHeight, double height) {
		  return base * triangleHeight / 2.0 * height;
	  }
	  
	  /**
	   * Calculate the volume of a Pentagonal prism
	   *
	   * @param length length of Pentagonal prism
	   * @param width width of Pentagonal prism
	   * @param height height of Pentagonal prism
	   * @return volume of given Pentagonal prism
	   */
	  private static double volumePentagonalPrism(double height, double length, double width) {
		  return 0.5 * length * width * height;
	  }
	  
	  /**
	   * Calculate the volume of a Hemisphere
	   *
	   * @param radius radius of Hemisphere
	   * @return volume of given Hemisphere
	   */
	  private static double volumeHemisphere(double radius) {
		  return 2.0 / 3.0 * Math.PI * radius * radius * radius;
	  }
	  
	  /**
	   * Calculate the volume of a cone
	   *
	   * @param height height of cone
	   * @param radius radius of cone
	   * @return volume of given cone
	   */
	  private static double volumeCone(double radius, double height) {
		  return Math.PI * radius * radius * height / 3.0;
	  }
	  
	  /**
	   * Calculate the volume of a pyramid
	   *
	   * @param height height of pyramid
	   * @param radius radius of pyramid
	   * @return volume of given pyramid
	   */
	  private static double volumePyramid(double height, double length, double width) {
		  return length * width * height / 3.0;
	  }
	  
	  /**
	   * Calculate the volume of a cylinder
	   *
	   * @param radius radius of cylinder
	   * @param height height of cylinder
	   * @return volume of given cylinder
	   */
	  private static double volumeCylinder(double radius, double height) {
		  return Math.PI * radius * radius * height;
	  }
}
