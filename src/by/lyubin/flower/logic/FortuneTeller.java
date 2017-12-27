package by.lyubin.flower.logic;

public class FortuneTeller {
    private String[][] array = new String[3][];
    private int chamomileCountLeaves = 3;

    public FortuneTeller() {
        array[0] = new String[]{"убьет", " не убьет", "сам умру"};
        array[1] = new String[]{"даст машину", " не даст", " подарит машину"};
        array[2] = new String[]{"закончу курсы", "не закончу", "закончу и возьмут в епам"};
        this.array = array;
    }

    public void tellFuture(String event) {
        if (chamomileCountLeaves >= 1) {
            switch (event) {
                case "one":
                    tellOne();
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

    private void tellOne() {
        this.chamomileCountLeaves--;
        System.out.println(array[0][this.chamomileCountLeaves]);
    }

    private void tellTwo() {
        this.chamomileCountLeaves--;
        System.out.println(array[1][this.chamomileCountLeaves]);
    }


    private void tellThree() {
        this.chamomileCountLeaves--;
        System.out.println(array[2][this.chamomileCountLeaves]);

    }
}
