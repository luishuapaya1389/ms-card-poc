package com.crud.card.repository;

import com.crud.card.model.Card;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CardRepository implements ICardRepository{

    /*@Autowired
    private JdbcTemplate jdbcTemplate;*/
    @Override
    public List<Card> findAll() {
        /* 
       String SQL = "SELECT * FROM cards WHERE status =1";
       return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Card.class));
       */
        Card car1 = new Card();
        car1.setId_card(1);
        car1.setCvv(1231);
        car1.setName("Luis");
        car1.setNumber("12345678");
        car1.setStatus(1);
        car1.setType("ahorros");

        Card car2 = new Card();
        car2.setId_card(2);
        car2.setCvv(4567);
        car2.setName("Fernando");
        car2.setNumber("98765432");
        car2.setStatus(0);
        car2.setType("corriente");


        List<Card> cards = new ArrayList<>();
        cards.add(car1);
        cards.add(car2);

        return cards;
    }

    /* 
    @Override
    public int save(Card card) {
        String SQL = "INSERT INTO cards VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(SQL, new Object[]{card.getName(), card.getNumber(), card.getType(),
                card.getCvv(),card.getStatus()});
    }

    @Override
    public int update(Card card) {
        String SQL = "UPDATE cards SET name =?, number = ?, type=?, cvv=? WHERE id_card = ?";
        return jdbcTemplate.update(SQL, new Object[]{card.getName(), card.getNumber(), card.getType(),
                card.getCvv(),card.getId_card()});
    }

    @Override
    public int deleteById(int id) {
        String SQL = "UPDATE cards SET status=0 WHERE id_card = ?";
        return jdbcTemplate.update(SQL, new Object[]{id});
    }
    */
}
