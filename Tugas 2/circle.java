// nama class circle.java
class  circle {
	//variabel radius dan color
	//radius ->double
	//color ->string
		double radius;
		String color;

		//konstruktor untuk class circle?
		//karena nama class sama dengan nama fungsi

		public circle(){

			radius = 2.0;
			color = "pink";
		}
		public circle (double r){
			radius = r;
			color = "pink";
		}
		public circle (double r,double c){
			radius = r;
			color = c;
		}
		public double getRadius(){
			return radius;
		}
		public String getColor(){
			return color;
		}
		public double getArea(){
			return radius*radius*Math.PI;
		}

		}

