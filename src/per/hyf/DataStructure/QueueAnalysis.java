package per.hyf.DataStructure;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class QueueAnalysis {
	
	/* Queue ʵ�� ��2�� �����ͷ�����*/
	
	/*
	 * ����������
	 * 1.PriorityQueue  �ص� �����б� �������ֵ������Ȼ����
	 * 2.ConcurrentLinkedQueue ���ڵ���̰߳�ȫ����
	 * 
	 * ��������
	 * 1.ArrayBlockingQueue
	 * 2.LinkedBlockingQueue
	 * 3.PriorityBlockingQueue
	 * 4.DelayQueue
	 * 5.SynchronousQueue
	 */
	
	
	public static void main(String[] args) {
		
		//�ص� �����б� �������ֵ������Ȼ����
		PriorityQueue<Integer> priq = new PriorityQueue<>();
		//�������ڵ���̰߳�ȫ����  �ŵ㣺 �������ʲ���Ҫͬ�� ����Ҫ֪����С ����β�����Ԫ�� ͷ��ɾ��
		//ȱ�� �� �ռ����д�С��Ϣ�����
		ConcurrentLinkedQueue<Integer> conq = new ConcurrentLinkedQueue<>();
		//add
		priq.add(1);
		priq.add(2);
		priq.add(6);
		priq.add(5);
		priq.add(4);
		
		conq.add(3);
		conq.addAll(priq);
		
		System.out.println(priq.toString());
		System.out.println(conq.toString());
		
		/* ----------------------��������  --------------***/
		//һ��������֧�ֵ��н����
		ArrayBlockingQueue<Integer> arrq = new ArrayBlockingQueue<Integer>(20);
		//�����ӵ�֧�ֵĿ�ѡ�н����
		LinkedBlockingQueue<Integer> linq = new LinkedBlockingQueue<>();
		//һ�������ȼ���֧�ֵ��޽����ȼ�����
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
		//һ�������ȼ�֧�֣�����ʱ����޽����ȼ�����
		DelayQueue<Delayed> Deq = new DelayQueue<>();
		//
		SynchronousQueue<Integer> synq = new SynchronousQueue<>();
		
		
	}
}




