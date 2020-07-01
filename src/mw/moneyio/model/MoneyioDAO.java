package mw.moneyio.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class MoneyioDAO {
	
	private SqlSessionTemplate sqlSession = null;
	
	public MoneyioDAO(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	//나의 카드리스트
	public List<My_cardDTO> card(String id) {
		return sqlSession.selectList("moneyio.card", id);
	}
	//나의 카드 계좌
	public List<My_cardDTO> card_Account(My_cardDTO mdto) {
		//System.out.println(ca_company);
		//System.out.println("dao: "+mdto.getId());
		return sqlSession.selectList("moneyio.card_Account", mdto);
	}
	//나의 계좌 잔액
	public int allMoney(MoneyioDTO dto) {
		return sqlSession.selectOne("moneyio.allMoney", dto);
	}
	//mwregistercard balance update
	public int balanceUpdate(My_cardDTO mdto) {
		return sqlSession.update("moneyio.balance_update", mdto);
	}
	//지출/수입 내역 입력
	public void insert(MoneyioDTO dto) {
//		System.out.println("id : " + dto.getId());

		sqlSession.insert("moneyio.insert", dto);
	}
	//더치페이 입력
	public void n_insert(NbreadDTO ndto) {

		sqlSession.insert("moneyio.n_insert", ndto);
	}
	//지출/수입 내역 수정 페이지
	public MoneyioDTO ioUpdateForm(int io_num) {

		return sqlSession.selectOne("moneyio.updateForm", io_num);
	}

	//지출/수입 내역 수정
	public void ioUpdatePro(MoneyioDTO dto) {
		sqlSession.update("moneyio.update", dto);
	}
	//더치페이 초기화
	public void n_delete(int io_num) {
		sqlSession.delete("moneyio.n_delete", io_num);
	}
	//더치페이 수정 입력
	public void n_insert2(NbreadDTO ndto) {
		sqlSession.insert("moneyio.n_insert2", ndto);
	}
	//연령대별 지출 chart 페이지 -20
	public List<MoneyioDTO> ageChart20() {
		return sqlSession.selectList("moneyio.chart20");
	}
	
	//연령대별 지출 chart 페이지 -30
	public List<MoneyioDTO> ageChart30() {
		return sqlSession.selectList("moneyio.chart30");
	}
	
	//연령대별 지출 chart 페이지 -40
	public List<MoneyioDTO> ageChart40() {
		return sqlSession.selectList("moneyio.chart40");
	}
	
	public List<NbreadDTO> nList(int io_num){
		return sqlSession.selectList("moneyio.nList", io_num);
	}
	public String nSum(int io_num) {
		return sqlSession.selectOne("moneyio.nSum", io_num);
	}
	
	public List moneyioListAll(String id) {
		
		return sqlSession.selectList("moneyio.moneyioListAll", id);
	}
	public List moneyioListIn(String id) {
		
		return sqlSession.selectList("moneyio.moneyioListIn", id);
	}
	public List moneyioListOut(String id) {
		
		return sqlSession.selectList("moneyio.moneyioListOut", id);
	}
	
	public MoneyioDTO moneyioListDetail(String id, int ioNum) {
		
		HashMap map = new HashMap();
		map.put("id", id);
		map.put("ioNum", ioNum);
		
		return sqlSession.selectOne("moneyio.moneyioListDetail", map);
	}
	
	public List moneyioListRemain(String id) {
		
		return sqlSession.selectList("moneyio.moneyioListRemain", id);
	}
	
	
	
	
}
