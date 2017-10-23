package upskills.autotagging.dao;

import java.util.List;

import upskills.autotagging.model.TrnHdr;

public interface TrnHdrDao extends Dao<TrnHdr> {
	//Add specified method for Issue
	public List<TrnHdr> getDataByFmly(String fmly);
}
