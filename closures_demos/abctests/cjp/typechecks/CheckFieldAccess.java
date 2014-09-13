public aspect CheckFieldAccess {
	
	int i;
	final int j=0;
	
	void fieldAccess1 ()  {
		exhibit JP { i=1; };	// no error
	}
	
	void fieldAccess2 ()  {
		exhibit JP { int i=j; };	//no error
	}
	
	void fieldAccess3 ()  {
		exhibit JP { j=1; }; //error: assignment to final field 
	}

	joinpoint void JP();
}
