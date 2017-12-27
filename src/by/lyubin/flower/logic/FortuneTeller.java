package by.lyubin.flower.logic;

public class FortuneTeller {
    String[][] array = new String[3][];
    int chamomileCountLeaves = 3;

    public FortuneTeller() {
        array[0] = new String[]{"убьет", " не убьет", "сам умру"};
        array[1] = new String[]{"даст машину", " не даст", " подарит машину"};
        array[2] = new String[]{"закончу курсы", "не закончу", "закончу и возьмут в епам"};
        this.array = array;
    }

    public void telFuture(String event) {
        if (chamomileCountLeaves >= 1) {
            switch (event) {
                case "one":
                    telOne();
                    break;

                case "two":
                    tellTwo();
                    break;

                case " three ":
                    tellThree();
                    break;
            }
        } else {
            System.out.println(" the petals are over ");
        }
    }

    public void telOne() {
        this.chamomileCountLeaves--;
        System.out.println(array[0][this.chamomileCountLeaves]);
    }

    public void tellTwo() {
        this.chamomileCountLeaves--;
        System.out.println(array[1][this.chamomileCountLeaves]);
    }


    public void tellThree() {
        this.chamomileCountLeaves--;
        System.out.println(array[2][this.chamomileCountLeaves]);

    }
}
