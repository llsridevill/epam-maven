package maven;

import java.util.Comparator;

public class Sort implements Comparator<Chocolate>{
int opt;
Sort(int n){
	this.opt = n;
}
public int compare(Chocolate ch1, Chocolate ch2) {
	switch(opt)
	{
	case 1:return ch1.ct-ch2.ct;
	case 2:return ch1.wt-ch2.wt;
	case 3:return ch1.n-ch2.n;
	}
	return 0;
}
}
