package q;

public class april_25_02 {
    public static void main(String[] args) {
        int distance = 100; // 总路程
        int forwardStep = 4; // 每小时向前走
        int backwardStep = 1; // 每小时后滑
        int hours = 0; // 小时数
        int currentDistance = 0; // 当前距离

        while (currentDistance < distance) {
            currentDistance += forwardStep;
            hours++;

            if (currentDistance >= distance) {
                break;
            }

            currentDistance -= backwardStep;
        }

        System.out.println("乌龟首次到达终点需要 " + hours + " 小时");
    }
}
