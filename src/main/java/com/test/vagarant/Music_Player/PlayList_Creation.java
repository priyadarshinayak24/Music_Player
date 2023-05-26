package com.test.vagarant.Music_Player;

	import java.util.Scanner;



	public class PlayList_Creation {

		static class Node{
			String Song;
			Node next;
			Node(String Song){
				this.Song=Song;
				this.next=null;
			}
		}
		Node head=null;
		
		public void creation() {
			int n,m,p;
			String Song;
			Scanner sc=new Scanner(System.in);
			do {
				System.out.println("Enter Song");
				Song=sc.next();
			//	System.out.println(Song);
				Node new_node=new Node(Song);
				if(head==null) {
					head=new_node;
				}
				else {
					System.out.println("Enter 1 to insert begining, 2 to insert at end, 3 to insert in specific index");
					m=sc.nextInt();
					switch(m) {
					case 1:
						new_node.next=head;
						head=new_node;
						break;
						
					case 2:
						Node temp=head;
						while(temp.next!=null) {
							temp=temp.next;
						}
						temp.next=new_node;
						break;
						
					case 3:
						System.out.println("Enter position of node to insert");
						p=sc.nextInt();
						Node temp1=head;
						for(int i=0;i<(p-1);i++) {
							temp1=temp1.next;
						}
						new_node.next=temp1.next;
						temp1.next=new_node;
						break;
					}
				}
				System.out.println("do u want to add more Songs. If yes, press:1");
				n=sc.nextInt();
			}
			while(n==1);
		}
		
		public void delete() {
			int n,m,p;
			String Song;
			Scanner sc=new Scanner(System.in);
			do {
				if(head==null) {
					System.out.print("LL is empty");
				}
				else {
					System.out.print("Enter 1 to delete from begining, 2 to delete from end, 3 to delete from specific index");
					m=sc.nextInt();
					switch(m) {
					case 1:
						Node temp=head;
						temp=temp.next;
						head=temp;
						break;
						
					case 2:
						Node temp1=head;
						Node ptr=temp1.next;
						while(ptr.next!=null)
						{
							temp1=ptr;
							ptr=ptr.next;
						}
						temp1.next=null;
						break;
						
					case 3:
						System.out.println("Enter position of node to be deleted");
						p=sc.nextInt();
						Node temp2=head;
						Node ptr1=temp2.next;
						for(int i=0;i<p-2;i++) {
							temp2=ptr1;
							ptr1=ptr1.next;
						}
						temp2.next=ptr1.next;
						break;
					}
				}
				System.out.println("u want to delete more Songs. If yes, press:1");
				n=sc.nextInt();
			}
			while(n==1);
		}
		public void traverse() {
			Node temp=head;
			if(head==null) {
				System.out.println("LL does not exist");
			}
			else {
				while(temp!=null) {
					System.out.print(temp.Song+ " ");
					temp=temp.next;
				}
			}
		}
		public static void main(String[] args) {
		     PlayList_Creation s=new PlayList_Creation();
	        s.creation();
	        s.delete();
	        s.traverse();
		}
	}

