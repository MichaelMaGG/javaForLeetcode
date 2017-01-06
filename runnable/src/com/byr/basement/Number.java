package com.byr.basement;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author maz22
 * @version 1.0
 * @create 2017/1/5
 * @since 1.0
 */
public class Number implements Runnable {

    private static int count = 10000;

    private String name;

    Number(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }

    /*
         一个文件中有10000个数，用Java实现一个多线程程序将这个10000个数输出到5个不用文件中（不要求输出到每个文件中的数量相同）。
         要求启动10个线程，两两一组，分为5组。
         每组两个线程分别将文件中的奇数和偶数输出到该组对应的一个文件中，
         需要偶数线程每打印10个偶数以后，就将奇数线程打印10个奇数，如此交替进行。
         同时需要记录输出进度，每完成1000个数就在控制台中打印当前完成数量，并在所有线程结束后，在控制台打印”Done”.
         */
    public static void main(String[] args) {
        Number odd = new Number("odd");
        Number even = new Number("even");
        Thread oddThread = new Thread(odd);
        Thread evenThread = new Thread(even);

    }


}
