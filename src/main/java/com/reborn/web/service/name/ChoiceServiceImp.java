package com.reborn.web.service.name;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reborn.web.dao.name.ChoiceDao;
import com.reborn.web.entity.name.Choice;
import com.reborn.web.entity.name.VoteView;

@Service
public class ChoiceServiceImp implements ChoiceService {

	@Autowired
	private ChoiceDao choiceDao;
	
	@Override
	public int insert(Choice choice) {
		// TODO Auto-generated method stub
		return choiceDao.insert(choice);
	}

	@Override
	public int update(Choice choice) {
		// TODO Auto-generated method stub
		return choiceDao.update(choice);
	}

	@Override
	public int delete(long animalId, int memberId) {
		// TODO Auto-generated method stub
		return choiceDao.delete(animalId, memberId);
	}

	@Override
	public Choice get(long animalId, int memberId) {
		// TODO Auto-generated method stub
		return choiceDao.get(animalId, memberId);
	}

	@Override
	public List<Choice> getList() {
		// TODO Auto-generated method stub
		return choiceDao.getList();
	}
	
	@Override
	public void getChoicedListByMemberId(int memberId, List<VoteView> list) {

		List<Long> animalIdList = choiceDao.getChoicedIdsByMemberId(memberId, list);
		
		for(VoteView v : list) {			
			for(long choicedId : animalIdList) {				
				long voteId = v.getAnimalId();
				if( voteId == choicedId ) {
					v.setChoiced(true);
					animalIdList.remove(choicedId);
					break;
				}
			}
		}
	}

}
