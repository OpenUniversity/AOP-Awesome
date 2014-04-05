package agent;

abstract aspect TranConcern {
  scoped joinpoint void enterTrans(int isolationLevel);
  joinpoint int defaultIsolationLevel() = 0;
  joinpoint void addCompensation(CompensationRecord r);
}

