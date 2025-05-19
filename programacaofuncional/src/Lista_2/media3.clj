(ns Lista-2.media3)

(defn media [a b c d]
  (let [total (/ (+ (+ (* 2.0 a) (* 3.0 b)) (+ (* 4.0 c) (* 1.0 d))) 10.0)]
    (if (>= total 7.0) (println (str (format "Media: %.1f\n" (float  total)) "Aluno aprovado."))
                       (if (< total 5.0)
                         (println (str (format "Media: %.1f\n" (float  total)) "Aluno reprovado."))
                       (let [r (read)
                             total2 (/ (+ total r) 2)]
                         (if (and (>= total 5.0) (< total 7.0))
                             (println (str (format "Media: %.1f\n" (float  total)) "Aluno em exame.\n"
                                           (format "Nota do exame: %.1f\n" r) "Aluno aprovado.\n"
                                           (format "Media final: %.1f" (float  total2))))

                             (println (str (format "Media: %.1f\n" total) "Aluno em exame.\n"
                                           (format "Nota do exame: %.1f\n" r) "Aluno reprovado.\n"
                                           (format "Media final: %.1f" (float  total2))))
                             ))))))


(defn main []
  (let [a (read)
        b (read)
        c (read)
        d (read)]
    (media a b c d)))

(main)