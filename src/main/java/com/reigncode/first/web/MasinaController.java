package com.reigncode.first.web;

import com.reigncode.first.model.Masina;
import com.reigncode.first.repo.MasinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 02/03/15.
 */
@Controller
public class MasinaController {
    @Autowired
    private MasinaRepository masinaRepository;
    @RequestMapping(value = "/masina/register", method = RequestMethod.POST)
    public ResponseEntity<Void> saveMasina(@RequestBody Masina masina){
        masinaRepository.save(masina);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/masina")
    public ResponseEntity<Page <Masina>> findAll(Pageable pageable){
        Page<Masina> masina = masinaRepository.findAll(pageable);
        return new ResponseEntity<>(masina, HttpStatus.OK);
    }
  @RequestMapping(value = "/masina/delete/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<Void>deleteMasina(@PathVariable Long id) {
      masinaRepository.delete(id);
      return new ResponseEntity<>(HttpStatus.OK);
  }

}
