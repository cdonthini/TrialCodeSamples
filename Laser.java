package Trials;

class Box {
static int size;
 Box(int s) { size = s; }
 }
 public class Laser {
 public static void main(String[] args) {
 Box b1 = new Box(5);
 Box[] ba = new Laser().go(b1, new Box(6));
 ba[0] = b1;
 for(Box b : ba) System.out.print(Box.size + " ");
 }
 Box[] go(Box b1, Box b2) {
 Box.size = 4;
 Box[] ma = {b2, b1};
 return ma;
 }
}