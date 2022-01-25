package shape1;

import circle.Circle;
import cylinder.Cylinder;
import prizm.Prizm;
import shape.D2;
import shape.D3;
import shape.Shape;
import tri.Tri;

// shape : ����
// ���� Ŭ���� ����(2���� ����, 3���� ����)
// 2�������� : ��, �簢��, �����ﰢ�� >> �ѷ�, ���̰� ��� 
// �� : r
// �簢�� : x, y
// �����ﰢ�� : x, y

// 3�������� : �����, ����ü, �ﰢ��� >> �ѳ���, ���� ���

// Shape[] shapes = new Shape[6];
// shapes[0] = new Circle(5);

// �߻�Ŭ����, �������̽��� ������ Ȱ���� ����
public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(3);
		shapes[1] = new Tri(3, 4);
		shapes[2] = new Cylinder(3, 4);
		shapes[3] = new Prizm(3, 4, 5);
		
		for(Shape s : shapes) {
			System.out.println(s.getClass().getSimpleName() + "�� ���̴� " + s.getArea());
			if(s instanceof D2) {
				System.out.println(s.getClass().getSimpleName() + "�� �ѷ��� " + ((D2)s).getCircum());
			}
			if(s instanceof D3) {
				System.out.println(s.getClass().getSimpleName() + "�� ���Ǵ� " + ((D3)s).getVolumn());
			}
		}
	}
}



