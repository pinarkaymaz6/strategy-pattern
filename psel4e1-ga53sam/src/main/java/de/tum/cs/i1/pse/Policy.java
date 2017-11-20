package de.tum.cs.i1.pse;

public class Policy {

	// TODO: add the missing attribute(Hint: Check the constructor)
	private Context context;
	public Policy(Context context) {
		// set the context
		this.context=context;
	}

	public void configure(boolean timeIsImportant, boolean spaceIsImportant) {
		// TODO: add implementation for choosing the appropriate Sorting algorithm
		if(timeIsImportant && !spaceIsImportant){
			context.setSortAlgorithm(new MergeSort());
		}else if(spaceIsImportant && spaceIsImportant){
			context.setSortAlgorithm(new QuickSort());
		}
	}
}
