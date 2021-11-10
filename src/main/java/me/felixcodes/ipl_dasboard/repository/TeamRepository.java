package me.felixcodes.ipl_dasboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.felixcodes.ipl_dasboard.models.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

    Team findByTeamName(String teamName);

}
