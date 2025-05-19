(ns Lista-4.dividindo)

(defn dividir [[x y]]
  (if (= y 0) "divisao impossivel"
    (format "%.1f" (/ (float x) (float y)))))

(defn main []
  (let [n (read)
        lista (repeatedly n #(repeatedly 2 read))]
    (doall (map (fn [x] (println (dividir x))) lista))))

(main)