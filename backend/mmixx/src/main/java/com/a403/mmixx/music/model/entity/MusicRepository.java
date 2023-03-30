package com.a403.mmixx.music.model.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.a403.mmixx.music.model.dto.MusicCountResponseDto;

public interface MusicRepository extends JpaRepository<Music, Integer>, MusicRepositoryCustom {
	Page<Music> findByUserSeq(Integer user_seq, Pageable pageable);
	
//	select count(*) from music where user_seq = 5;
	Integer countByUserSeq(Integer user_seq);
//	select count(*) from music where user_seq = 5 and mixed is null and edited is null;
	Integer countByUserSeqAndMixedNullAndInstNull(Integer user_seq);
//	select count(*) from music where user_seq = 5 and mixed is not null and mixed != 0;
	Integer countByUserSeqAndMixedNotNullAndMixedGreaterThan(Integer user_seq, Integer mixed);
//	select count(*) from music where user_seq = 5 and edited is not null and edited != 0;
	Integer countByUserSeqAndInstNotNullAndInstGreaterThan(Integer user_seq, Integer inst);

}
