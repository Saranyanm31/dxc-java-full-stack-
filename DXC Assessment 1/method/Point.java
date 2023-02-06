package method;

public class Point {

		private double x;
		private double y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}

		public double distance() {
		    return(Math.sqrt(x*x + y*y));
		}
		public double distance(Point p) {

			return Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX())
					+ (this.getY() - p.getY()) * (this.getY() - p.getY()));
		}

	}

	

			
	