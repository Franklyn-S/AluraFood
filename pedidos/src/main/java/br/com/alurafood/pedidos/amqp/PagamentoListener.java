package br.com.alurafood.pedidos.amqp;

import br.com.alurafood.pedidos.dto.PagamentoDto;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoListener {
    @RabbitListener(queues = "pagamentos.detalhes-pedido")
    public void recebeMensagem(PagamentoDto pagamento) {
        System.out.println(pagamento);
    }
}
