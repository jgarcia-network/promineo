package coding_assignment;

public class Application {

	public static void main(String[] args) {
		/* SQL
		 * create database if not exists teams;
		 * use teams;
		 * drop table if exists roster;
		 * 
		 * create table roster(
		 * id int(10) not null auto_increment,
		 * name varchar(50) not null,
		 * position varchar (50) not null,
		 * primary key (id)
		 * )
		 * 
		 */
		
		Menu menu = new Menu();
		menu.start();
	}

}
