package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService  {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    //Get All the Data
    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    //Post the Data
    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }

    // Get Data By id
    public Optional<JournalEntry> findById(ObjectId id){
        return journalEntryRepository.findById(id);
    }
    // Delete By id
    public void deleteById(ObjectId id){
        journalEntryRepository.deleteById(id);
    }
    // Update By id
    public Optional<JournalEntry> updateById(ObjectId id){
        return journalEntryRepository.findById(id);
    }
}
