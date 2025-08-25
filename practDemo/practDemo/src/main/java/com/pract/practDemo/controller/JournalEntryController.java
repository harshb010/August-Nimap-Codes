package com.pract.practDemo.controller;

import com.pract.practDemo.entity.JournalEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry)
    {
        journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping
    public List<JournalEntry> getAll()
    {
        return new ArrayList<>(journalEntries.values());
    }

    @PutMapping ("id/{myid}")
    public ResponseEntity<JournalEntry> updateById(@PathVariable long myid, @RequestBody JournalEntry myEntry)
    {
            journalEntries.put(myid,myEntry);
            return ResponseEntity.status(HttpStatus.OK).body(journalEntries.get(myid));
    }


    @GetMapping("id/{myid}")
    public JournalEntry getByid(@PathVariable long myid)
    {
        return journalEntries.get(myid);
    }

    @DeleteMapping("id/{myid}")
    public void deleteByid(@PathVariable long myid)
    {
        journalEntries.remove(myid);

    }

}
