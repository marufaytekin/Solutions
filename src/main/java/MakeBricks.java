
/**
 * Created by maruf on 11/9/16.
 *
 * We want to make a row of bricks that is goal inches long. We have a number
 * of small bricks (1 inch each) and big bricks (5 inches each). Return true
 * if it is possible to make the goal by choosing from the given bricks. This
 * is a little harder than it looks and can be done without any loops.
 */
public class MakeBricks {

    public static void main(String[] args) {
        System.out.println(makeBricks(10, 0, 10));
        System.out.println(makeBricks(0, 3, 10));
        System.out.println(makeBricks(4, 1, 10));
        System.out.println(makeBricks(1, 2, 10));
    }



    public static boolean makeBricks(int small, int big, int goal) {
        if (big == 0) return (small >= goal);
        if (small == 0) return (goal % 5 == 0);
        if ((goal % 5) > small) return false;
        if (goal > 0) return makeBricks(small, big, goal-small) ||
                makeBricks(small, big, goal-(big*5)) ||
                makeBricks(small, big, goal-(small+big*5));
        else return false;
    }

}
