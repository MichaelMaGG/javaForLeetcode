package com.byr.basement;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>	�޸ļ�¼
 * <BR>-----------------------------------------------
 * <BR>	�޸�����			�޸���			�޸�����
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
         һ���ļ�����10000��������Javaʵ��һ�����̳߳������10000���������5�������ļ��У���Ҫ�������ÿ���ļ��е�������ͬ����
         Ҫ������10���̣߳�����һ�飬��Ϊ5�顣
         ÿ�������̷ֱ߳��ļ��е�������ż������������Ӧ��һ���ļ��У�
         ��Ҫż���߳�ÿ��ӡ10��ż���Ժ󣬾ͽ������̴߳�ӡ10����������˽�����С�
         ͬʱ��Ҫ��¼������ȣ�ÿ���1000�������ڿ���̨�д�ӡ��ǰ������������������߳̽������ڿ���̨��ӡ��Done��.
         */
    public static void main(String[] args) {
        Number odd = new Number("odd");
        Number even = new Number("even");
        Thread oddThread = new Thread(odd);
        Thread evenThread = new Thread(even);

    }


}
