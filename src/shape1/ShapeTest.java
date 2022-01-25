package shape1;

import circle.Circle;
import cylinder.Cylinder;
import prizm.Prizm;
import shape.D2;
import shape.D3;
import shape.Shape;
import tri.Tri;

// shape : 도형
// 하위 클래스 제작(2차원 도형, 3차원 도형)
// 2차원도형 : 원, 사각형, 직각삼각형 >> 둘레, 넓이값 계산 
// 원 : r
// 사각형 : x, y
// 직각삼각형 : x, y

// 3차원도형 : 원기둥, 육면체, 삼각기둥 >> 겉넓이, 부피 계산

// Shape[] shapes = new Shape[6];
// shapes[0] = new Circle(5);

// 추상클래스, 인터페이스를 적절히 활용해 제작
public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(3);
		shapes[1] = new Tri(3, 4);
		shapes[2] = new Cylinder(3, 4);
		shapes[3] = new Prizm(3, 4, 5);
		
		for(Shape s : shapes) {
			System.out.println(s.getClass().getSimpleName() + "의 넓이는 " + s.getArea());
			if(s instanceof D2) {
				System.out.println(s.getClass().getSimpleName() + "의 둘레는 " + ((D2)s).getCircum());
			}
			if(s instanceof D3) {
				System.out.println(s.getClass().getSimpleName() + "의 부피는 " + ((D3)s).getVolumn());
			}
		}
	}
}



