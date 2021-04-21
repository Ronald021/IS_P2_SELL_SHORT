package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.shell_sort;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.shell_sort.service.ShellSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShellSortApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShellSortApplication.class, args);
		int arr[] = {12, 34, 54, 2, 3};
		System.out.println("Array before sorting");
		ShellSort sellSort = new ShellSort();
		sellSort.printArray(arr);

		sellSort.sort(arr);

		System.out.println("Array after sorting");
		sellSort.printArray(arr);
	}

}
