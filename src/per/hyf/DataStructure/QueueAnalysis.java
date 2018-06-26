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
	
	/* Queue 实现 有2种 阻塞和非阻塞*/
	
	/*
	 * 非阻塞队列
	 * 1.PriorityQueue  特点 有序列表 对里面的值进行天然排序
	 * 2.ConcurrentLinkedQueue 链节点的线程安全队列
	 * 
	 * 阻塞队列
	 * 1.ArrayBlockingQueue
	 * 2.LinkedBlockingQueue
	 * 3.PriorityBlockingQueue
	 * 4.DelayQueue
	 * 5.SynchronousQueue
	 */
	
	
	public static void main(String[] args) {
		
		//特点 有序列表 对里面的值进行天然排序
		PriorityQueue<Integer> priq = new PriorityQueue<>();
		//基于链节点的线程安全队列  优点： 并发访问不需要同步 不需要知道大小 队列尾部添加元素 头部删除
		//缺点 ： 收集队列大小信息会很慢
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
		
		/* ----------------------阻塞队列  --------------***/
		//一个由数组支持的有界队列
		ArrayBlockingQueue<Integer> arrq = new ArrayBlockingQueue<Integer>(20);
		//由连接点支持的可选有界队列
		LinkedBlockingQueue<Integer> linq = new LinkedBlockingQueue<>();
		//一个由优先级堆支持的无界优先级队列
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
		//一个由优先级支持，基于时间的无界优先级队列
		DelayQueue<Delayed> Deq = new DelayQueue<>();
		//
		SynchronousQueue<Integer> synq = new SynchronousQueue<>();
		
		
	}
}




