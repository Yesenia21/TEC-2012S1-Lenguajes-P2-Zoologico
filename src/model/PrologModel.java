package model;

public class PrologModel {
	/*
	 * SAMPLE #1
	Prolog engine = new Prolog();
	SolveInfo info = engine.solve("append([1],[2,3],X).");
	System.out.println(info.getSolution());
	 * SAMPLE #2
	Prolog engine = new Prolog();
	Term t=new Struct();
	// t will be [0,1,2,...,9,10]
	for (int i=10;i>=0;i--){
		t=new Struct(new Int(i),t);
	}
	Term app=new Struct("append",t,t,new Var("X"));
	SolveInfo info = engine.solve(app);
	Struct t2=(Struct)info.getTerm("X");
	for(Iterator<? extends Term> i=t2.listIterator();i.hasNext();){
		System.out.println(""+i.next());
	}
	 /* SAMPLE #3
	Prolog engine = new Prolog();
	Theory t=new Theory(
	"search(E,[E|_])."+"\n"+
	"search(E,[_|L]):-search(E,L)."+"\n"
	);
	// engine.setTheory(new FileInputStream("file.pl"));
	engine.setTheory(t);
	try {
		SolveInfo info = engine.solve("search(4,[1,2,3]).");
		System.out.println(""+info.getSolution());
	} catch(Exception e){
		System.out.println("no");
	}
	*/
}