package services;

import actions.views.GoodConverter;
import actions.views.GoodView;

public class GoodService extends ServiceBase  {
    /**
     * 画面から入力された日報の登録内容を元にデータを1件作成し、日報テーブルに登録する
     * @param gv いいねの登録内容
     * @return バリデーションで発生したエラーのリスト
     */
    public void create(GoodView gv) {
        createInternal(gv);



        //バリデーションで発生したエラーを返却（エラーがなければ0件の空リスト）
    }
    /**
     * いいねを1件登録する
     * @param gv いいねデータ
     */
    private void createInternal(GoodView gv) {

        em.getTransaction().begin();
        em.persist(GoodConverter.toModel(gv));
        em.getTransaction().commit();

    }
}
